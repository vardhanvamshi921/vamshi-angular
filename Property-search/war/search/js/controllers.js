'use strict';

/* Controllers */

var propertyControllers = angular.module('propertiesControllers', []);

propertyControllers.controller('PropertiesController', ['$scope','propertyService',
  function($scope, propertyService) {
    $scope.properties = propertyService.properties;
  }]);

propertyControllers.controller('PropertyInfoController', ['$scope', '$routeParams','propertyService',
  function($scope, $routeParams, propertyService) {
	console.log($routeParams.name);
	$scope.propertyInfo = propertyService.getProperty($routeParams.name)[0];
  }]);