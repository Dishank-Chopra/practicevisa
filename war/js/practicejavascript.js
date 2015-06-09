
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

        };

    });



    
/*
	var app = angular.module('myApp', []);

	function MyController($scope, $http) {
		$http({
		        method : 'POST',
				url : 'PracticevisaServlet'
				$scope.count="totalcount";
				}.success(function(data, status, headers, config) {
				$scope.person = data;
				
			}).error(function(data, status, headers, config) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});

		};
	};
*/
    

    
    
/*

function checkEmail(emailId) {
        if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(emailId)){
       // document.write("You have entered valid email.");
        return true;
        }    
        return false;
        }

        function ValidateEmail(){
            var emailID=document.form.email;

            if ((emailID.value == null)||(emailID.value == "")){
               // alert("Please Enter your Email ID")
                emailID.focus()
                return false
            }

            if (checkEmail(emailID.value)==false){
                emailID.value=""
            //    document.write(" Enter something valid!");
                window.alert("Invalid Email Address");
                emailID.focus()
                return false
            }
               // alert('valid');
                return true
         }
   */     
