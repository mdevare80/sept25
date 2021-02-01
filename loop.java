<html>
    <head>
        <title>
            Js Types
        </title>
    </head>
    <body>
        <p id ="demo"></p>
        <div>This Demo To View Function</div>
        <p id = "demo1"></p>
        <div> The Odd Numbers Between 1 To 10</div>
        <script>
            b=5;
            function myfun()
            {
                if(b >= 0)
                {
                    return "Number Is Positive";
               }
                else
                {
                    return "Number Is Negative"
                }
            }
            document.getElementById("demo").innerHTML = myfun();
            function myfun1()
            {
                var i = 1;
                while(i<=10)
                {

                    document.write(i + "<br>");
                    i+=2;
                }
            }
            document.getElementById("demo1").innerHTML = myfun1();
        </script>
    </body>
</html>
