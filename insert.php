 <?php

         $con = mysql_connect("localhost","root","");
         if (!$con)
           {
             die('Could not connect: ' . mysql_error());
           }

           mysql_select_db("ex1", $con);


           $v1=isset($_REQUEST['f1']);
           $v2=isset($_REQUEST['f2']);
           $v3=isset($_REQUEST['f3']); 


              if($v1==NULL || $v2==NULL || $v3==NULL)
             {


                $r["re"]="Fill the all fields!!!";
                 print(json_encode($r));
                die('Could not connect: ' . mysql_error());
             }


            else
          {
           $i=mysql_query("select * from t1 where f1=$v1",$con);
           $check='';
                  while($row = mysql_fetch_array($i))
                    {
  
                          $check=$row['f1'];

                     }

           
                   if($check==NULL)
                  {

                        $q="insert into t1 values('$v1','$v2','$v3')";
                        $s= mysql_query($q); 
                        if(!$s)
                          {
                                $r["re"]="Inserting problem in batabase";
                  
                               print(json_encode($r));
                           }
                         else
                          {
                             $r["re"]="Record inserted successfully";
                              print(json_encode($r));
                           }
             }
            else
             {
               $r["re"]="Record is repeated";
                 print(json_encode($r));
      
              } 
}
 mysql_close($con);
               
    ?>  