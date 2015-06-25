	function MyController($scope, $http) {
		/*$scope.getDatFromServer=function(){
		*/	$http({
					method : 'POST',
					url : 'practicevisaServlet'
				}).success(function(data, status, headers, config) {
					$scope.person = data;
					
				}).error(function(data, status, headers, config) {
					// called asynchronously if an error occurs
					// or server returns response with an error status.
				});
			};	
		/*};*/
	

	function MainController($scope){
		$scope.submit = function(){
		    // Set the 'submitted' flag to true
		    $scope.submitted = true;
		    // Send the form to server
		    // $http.post ...
		    if($scope.form.$valid){
		    	$scope.info="You are successfully registered.";
		    }
		  }
		};

	/*var validationApp = angular.module('validationApp', []);		*/
		
	

	
	/*var validationApp = angular.module('validationApp', []);
	
	validationApp.controller('registerController', function($scope) {	
		        // function to submit the form after all validation has occurred            
	        $scope.submitForm = function() {
	        	$scope.submitted = true;
		           //  check to make sure the form is completely valid
		            if ($scope.userForm.$valid) {
		             alert('Form Validations');
		           }
	        };
	}) ;
		  */

		   
	