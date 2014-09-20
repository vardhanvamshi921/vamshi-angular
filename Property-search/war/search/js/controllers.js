'use strict';

/* Controllers */

var propertyControllers = angular.module('propertiesControllers', []);

propertyControllers.controller('PropertiesController', ['$scope','propertyService','propertyServiceWithPromise',
  function($scope, propertyService, propertyServiceWithPromise) {
     propertyServiceWithPromise.getProperties()
					.then(function(data) {
						//promise fulfilled
						$scope.properties = data;
					}, function(error) {
						$scope.properties = error;
					});
  }]);

propertyControllers.controller('PropertyInfoController', ['$scope', '$routeParams','propertyService',
  function($scope, $routeParams, propertyService) {
	console.log($routeParams.name);
	$scope.propertyInfo = propertyService.getProperty($routeParams.name)[0];
  }]);


propertyControllers.controller('directiveController', ['$scope',
      function($scope) {
		var directive = {};
		directive.title = "Directive title";
		directive.msg = "Directive msg";
		directive.okbutton = "Ok";
		directive.cancel = "Cancel";
		$scope.directiveVal = directive;
}]);
