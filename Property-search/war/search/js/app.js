'use strict';

/* App Module */

var proertiesApp = angular.module('properties', [
  'ngRoute',
  'propertiesControllers', 
  'propertiesServices',
  'propertyFilters'
]);

proertiesApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/properties', {
        templateUrl: 'views/properties.html',
        controller: 'PropertiesController'
      }).
      when('/properties/:name', {
        templateUrl: 'views/propertyinfo.html',
        controller: 'PropertyInfoController'
      }).
      otherwise({
        redirectTo: '/properties'
      });
  }]);
