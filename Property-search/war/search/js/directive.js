angular.module('customerDetails', [])
  .directive('customerinfo', function() {
    return {
      restrict: 'C',
      transclude: true,
      scope: {
        customer : "=customer"
      },
      templateUrl : 'views/directive-template.html'
    };
  }).controller ('customerController', function($scope) {
    var customer = {};
    customer.name="vamshi";
    customer.country="india";
    customer.phno = 9491364189;
    customer.email = "vamshi921@yahoo.com";
    $scope.customer = customer;
  });