var app = angular.module('MyGridApp', ['ngGrid']);

app.controller('bodyController', ['$scope', '$http', function($scope, $http) {
	$scope.myData = {};
    $http.get('http://localhost:8080/app/langlist/getall').success(function(data) {
    	$scope.myData = data;
    });
    $scope.gridOptions = { data : 'myData' };// $scope.myData is also acceptable but will not update properly. OK to use the object if you don't care about updating the data in the grid.
}]);