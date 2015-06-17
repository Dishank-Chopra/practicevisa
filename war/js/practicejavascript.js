var app = angular.module('myApp', []);

	function MyController($scope, $http) {
	
		$http({
				method : 'POST',
				url : 'practicevisaServlet'
			}).success(function(data, status, headers, config) {
				$scope.person = data;
			}).error(function(data, status, headers, config) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
	};	

	var validationApp = angular.module('validationApp', []);
	
	validationApp.controller('MainController', function($scope){
		
		$scope.submit = function(){
		    // Set the 'submitted' flag to true
		    $scope.submitted = true;
		    // Send the form to server
		    // $http.post ...
		    
		  }
	});

	/*var validationApp = angular.module('validationApp', []);
	
	validationApp.controller('registerController', function($scope) {	
		        // function to submit the form after all validation has occurred            
	        $scope.submitForm = function() {
		           //  check to make sure the form is completely valid
		            if ($scope.userForm.$valid) {
		          //    alert('Form Validations');
		           }
	        };
	}) ;
		  */

		   /* validationApp.controller('myController', function($scope, $http) {
		  	        	$http({
	    				method : 'POST',
	    				url : 'practicevisaServlet'
	    			}).success(function(data, status, headers, config) {
	    				$scope.person = data;
	    			}).error(function(data, status, headers, config) {
	    				//	alert('Failed in mycontroller');
	    				// called asynchronously if an error occurs
	    				// or server returns response with an error status.
	    			});
	            });
		
		
		    validationApp.controller('registerController', function($scope, $http) {
  	        	$http({
				method : 'POST',
				url : 'practicevisaServlet'
			}).success(function(data, status, headers, config) {
				$scope.person = data;
			}).error(function(data, status, headers, config) {
				// alert('Failed in registercontroller');
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
        });
*/
    
		    
	