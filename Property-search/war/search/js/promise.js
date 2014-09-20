'use strict';

var propertiesPromises= angular.module('propertiesPromise', []);


propertiesPromises.factory('propertyServiceWithPromise',['$http', '$q', function ($http, $q) {
		var properties = [];
	    var getProperties = function() {
	            // the $http API is based on the deferred/promise APIs exposed by the $q service
	            // so it returns a promise for us by default
	            return $http.get('../read')
	                .then(function(response) {
	                	properties = response.data;
	                	return properties;
	                }, function(response) {
	                	return $q.reject(response.data);
	            });
	        };
	    var factory = {
	    		getProperties : getProperties
	     };
	    return factory
	}]);