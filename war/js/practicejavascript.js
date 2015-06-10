 /*
// create angular app
    var validationApp = angular.module('validationApp', []);

    // create angular controller
   validationApp.controller('mainController', function($scope) {

        // function to submit the form after all validation has occurred            
        $scope.submitForm = function() {

            // check to make sure the form is completely valid
            if ($scope.userForm.$valid) {
                alert('our form is amazing');
            }
        }
            function MyController($scope, $http) {
            	$scope.getdata=function(){
            	$http({
    				method : 'POST',
    				url : 'PracticevisaServlet'
    			}).success(function(data, status, headers, config) {
    				$scope.person = data;
    			}).error(function(data, status, headers, config) {
    				// called asynchronously if an error occurs
    				// or server returns response with an error status.
    			});
            };
           }};

*/



		// create angular app
		    var validationApp = angular.module('validationApp', []);
		
		    // create angular controller
		    validationApp.controller('mainController', function($scope) {
		
		        // function to submit the form after all validation has occurred            
		        $scope.submitForm = function() {
		           //  check to make sure the form is completely valid
		            if ($scope.userForm.$valid) {
		              alert('Form Validations');
		           }
		        };
		     });
		    
		    validationApp.controller('myController', function($scope, $http) {
		  	        	$http({
	    				method : 'POST',
	    				url : 'practicevisaServlet'
	    			}).success(function(data, status, headers, config) {
	    				$scope.person = data;
	    			}).error(function(data, status, headers, config) {
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
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
        });

    
		    
	/*	
			var app = angular.module('myApp', []);
		
			function MyController($scope, $http) {
				$http({
				        method : 'POST',
						url : 'PracticevisaServlet'
						$scope.count="totalcount";
						}.success(function(data, status, headers, config) {
					//	$scope.person = data;
						$scope.count=data;
					}).error(function(data, status, headers, config) {
						// called asynchronously if an error occurs
						// or server returns response with an error status.
					});
		
				};
			};
		
		    
			
		    });
		    
   */ 
  
