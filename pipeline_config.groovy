libraries { 
    maven { 
        build_params = "mvn -DpropA=valueA clean package"  // here you can write custom parameters
         test_param = "some test params i don't konw"
     } 
    
}
