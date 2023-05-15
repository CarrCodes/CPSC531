/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import DS from 'ember-data';

export default DS.Model.extend({
  appId: DS.attr('string'),
  state: DS.attr('string'),
  user: DS.attr('string'),
  containers: DS.attr('array'),
  /**
   * Indicates no rows were retrieved from backend
   */
  isDummyApp: function() {
    return this.get('id') === "dummy";
  }.property("id"),

  appStateStyle: function() {
    var style = "default";
    var appState = this.get("state");
    if (appState === "RUNNING" || appState === "FINISHING_CONTAINERS_WAIT" ||
        appState === "APPLICATION_RESOURCES_CLEANINGUP") {
      style = "primary";
    } else if (appState === "FINISHED") {
      style = "success";
    }
    return "label label-" + style;
  }.property("state")
});
