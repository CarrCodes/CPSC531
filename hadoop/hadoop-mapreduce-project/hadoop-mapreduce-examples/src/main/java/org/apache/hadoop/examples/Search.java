package org.apache.hadoop.examples;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Search extends Mapper<Object, Text, Text, IntWritable> implements Tool {
    
    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();
      
    public void map(Object key, Text value, Context context
                    ) throws IOException, InterruptedException {
      StringTokenizer itr = new StringTokenizer(value.toString());
      while (itr.hasMoreTokens()) {
        word.set(itr.nextToken());
        context.write(word, one);
      }
    }

    public void setConf(Configuration conf) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'setConf'");
    }

    public Configuration getConf() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getConf'");
    }

    public int run(String[] args) throws Exception {
      JSONParser parser = new JSONParser();
      Object obj = parser.parse(new FileReader(args[0]));
      JSONObject jo = (JSONObject) obj;
      JSONArray jsar = new JSONArray();
      jsar = (JSONArray) jo.get("dataset");
      String keyword = args[1];

      Configuration conf = new Configuration();
      JobClient client = new JobClient(conf);
      Job job = Job.getInstance(conf);
      job.setJobName("search");
      job.setJarByClass(Search.class);
      job.setMapperClass(Mapper.class);
      job.setCombinerClass(Reducer.class);
      job.setReducerClass(Reducer.class);
      job.setOutputKeyClass(Text.class);
      job.setOutputValueClass(JSONObject.class);
      JSONArray resultsArray = new JSONArray();

      int total = jsar.size();
      for(int i = 0; i < total; i++) {
        JSONObject temp = (JSONObject) jsar.get(i);
        String description = temp.get("description").toString();
        String title = temp.get("title").toString();

        if(description.contains(keyword) || title.contains(keyword)) {
          resultsArray.add(temp);
        };
      };

      FileWriter outputFile = new FileWriter("searchResults.json");
      outputFile.write(resultsArray.toJSONString());
      outputFile.close();
      // context.write(key, value);
      return job.waitForCompletion(true) ? 0 : 1;
    }

  public static void main(String[] args) throws Exception {
    if (args.length < 2) {
      System.err.println("Search Job missing parameter(s)");
      System.exit(2);
    } else if (args.length > 2) {
      System.err.println("Search Job sent too many parameters");
      System.exit(2);
    }// jo.get("dataset");

    int res = ToolRunner.run(new Configuration(), new Search(), args);
    System.exit(res);
  }
}