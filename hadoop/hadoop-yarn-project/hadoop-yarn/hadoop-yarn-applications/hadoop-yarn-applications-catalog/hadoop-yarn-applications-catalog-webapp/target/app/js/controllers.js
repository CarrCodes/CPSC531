var controllers=angular.module("controllers",[]);controllers.controller("AppListController",["$scope","$rootScope","$http",function(d,b,e){d.appList=[];function a(f){d.appList=f.data;b.$emit("hideLoadScreen",{})}function c(f){b.$emit("hideLoadScreen",{});console.log("Error in downloading application list")}b.$on("RefreshAppList",function(){d.refreshList()});d.refreshList=function(){e({method:"GET",url:"/v1/app_list"}).then(a,c)};d.deleteApp=function(g,f){b.$emit("showLoadScreen",{});e({method:"DELETE",url:"/v1/app_list/"+g+"/"+f}).then(function(h){b.$emit("RefreshAppList",{});window.location="/#"},function(h){console.log(h)})};e({method:"GET",url:"/v1/app_list"}).then(a,c)}]);controllers.controller("AppStoreController",["$scope","$rootScope","$http",function(d,b,e){d.canDeployApp=function(){return false};d.appStore=[];d.searchText=null;function a(f){d.appStore=f.data}function c(f){console.log("Error in downloading AppStore information.")}d.deployApp=function(f){window.location="/#!/deploy/"+f};e({method:"GET",url:"/v1/app_store/recommended"}).then(a,c);d.change=function(g){var f=d.searchText;e({method:"GET",url:"/v1/app_store/search?q="+f}).then(a,c)}}]);controllers.controller("AppDetailsController",["$scope","$interval","$rootScope","$http","$routeParams",function(d,f,b,h,e){d.details={yarnfile:{state:"UNKNOWN"}};d.appName=e.id;var g=f(function(){d.refreshAppDetails()},2000);d.refreshAppDetails=function(){h({method:"GET",url:"/v1/app_details/status/"+d.appName}).then(a,c)};d.stopApp=function(i){h({method:"POST",url:"/v1/app_details/stop/"+i}).then(function(l,j,m,k){d.refreshAppDetails()},c)};d.restartApp=function(i){h({method:"POST",url:"/v1/app_details/restart/"+i}).then(function(l,j,m,k){d.refreshAppDetails()},c)};d.upgradeApp=function(i){window.location="/#!/upgrade/"+i};d.canDeployApp=function(){return true};d.checkServiceLink=function(){if(d.details.yarnfile.state!="STABLE"){return true}else{return false}};function a(i){if(i.data.yarnfile.components.length!=0){d.details=i.data}else{d.details.yarnfile.state=i.data.yarnfile.state}}function c(i){console.log("Error in getting application detail")}b.$on("RefreshAppDetails",function(){d.refreshAppDetails()});d.$on("$locationChangeStart",function(){f.cancel(g)});d.$on("$destroy",function(){f.cancel(g)});h({method:"GET",url:"/v1/app_details/config/"+d.appName}).then(a,c)}]);controllers.controller("NewAppController",["$scope","$rootScope","$http",function(d,b,e){d.details={name:"",version:"",organization:"",description:"",quicklinks:{UI:"http://${SERVICE_NAME}.${USER}.${DOMAIN}:8080/"},icon:"",components:[{name:"",number_of_containers:1,artifact:{id:"centos:latest"},launch_command:"",resource:{cpus:1,memory:2048},run_privileged_container:false,dependencies:[],placement_policy:{constraints:[]},configuration:{env:{YARN_CONTAINER_RUNTIME_DOCKER_RUN_OVERRIDE_DISABLE:"true"},properties:{"docker.network":"host"}}}]};d.template={name:"",number_of_containers:1,artifact:{id:"centos:latest"},launch_command:"",resource:{cpus:1,memory:2048},run_privileged_container:false,dependencies:[],placement_policy:{constraints:[]},configuration:{env:{YARN_CONTAINER_RUNTIME_DOCKER_RUN_OVERRIDE_DISABLE:"true"},properties:{"docker.network":"host"}}};d.message=null;d.error=null;d.save=function(){e({method:"POST",url:"/v1/app_store/register",data:JSON.stringify(d.details)}).then(a,c)};d.add=function(){d.details.components.push(d.template)};d.remove=function(f){d.details.components.splice(f,1)};function a(f){d.message="Application published successfully.";setTimeout(function(){d.$apply(function(){window.location="/#"})},5000)}function c(f){d.error="Error in registering application configuration."}}]);controllers.controller("DeployAppController",["$scope","$rootScope","$http","$routeParams",function(d,b,f,e){d.id=e.id;function a(g){d.details=g.data;b.$emit("hideLoadScreen",{})}function c(g){b.$emit("hideLoadScreen",{});console.log("Error in downloading application template.")}d.launchApp=function(g){b.$emit("showLoadScreen",{});f({method:"POST",url:"/v1/app_list/"+d.id,data:JSON.stringify(d.details.app)}).then(function(j,h,k,i){b.$emit("RefreshAppList",{});window.location="/#!/app/"+j.data.id},function(j,h,k,i){console.log("error",j,h)})};f({method:"GET",url:"/v1/app_store/get/"+d.id}).then(a,c)}]);controllers.controller("UpgradeAppController",["$scope","$rootScope","$http","$routeParams",function(d,b,f,e){d.message=null;d.error=null;d.appName=e.id;d.refreshAppDetails=function(){f({method:"GET",url:"/v1/app_details/status/"+d.appName}).then(a,c)};d.upgradeApp=function(g){b.$emit("showLoadScreen",{});f({method:"PUT",url:"/v1/app_details/upgrade/"+d.appName,data:JSON.stringify(d.details)}).then(function(j,h,k,i){b.$emit("RefreshAppList",{});window.location="/#!/app/"+j.data.id},function(j,h,k,i){b.$emit("hideLoadScreen",{});d.error=j.data;$("#error-message").html(j.data);$("#myModal").modal("show");console.log("error",j,h)})};function a(g){if(g.data.yarnfile.components.length!=0){d.details=g.data.yarnfile}else{d.details.state=g.data.yarnfile.state}}function c(g){b.$emit("hideLoadScreen",{});d.error="Error in getting application detail.";$("#error-message").html(d.error);$("#myModal").modal("show")}d.refreshAppDetails()}]);controllers.controller("LoadScreenController",["$scope","$rootScope","$http",function(b,a,c){b.loadScreen="hide";a.$on("showLoadScreen",function(){b.loadScreen="show"});a.$on("hideLoadScreen",function(){b.loadScreen="hide"})}]);