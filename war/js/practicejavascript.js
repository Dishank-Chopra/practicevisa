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
        
