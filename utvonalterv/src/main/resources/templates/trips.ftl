<html>
    <head>
        <title>Utvonaltervezo</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>

    </head>
    <body style="padding-top: 50px;">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <ul class="nav navbar-nav">
                        <li><a href=".."><-- Back</a></li>
                        <li><a> </a></li>
                        <li><a> </a></li>
                    </ul>
                    <a class="navbar-brand">Trip List</a>
                </div>
            </div>
        </nav>

        <div class="container" style="padding: 40px 15px;">
            <div class="row">
                <div class="col-sm-6 col-md-4">

                    <#list trips as line, trip>
                        <h3>${line.lineType.getName()}-${line.lineId} : </h3>
                        <ul style="font-size:20px">
                            <li>${trip.start.name}</li>
                            <#list trip.targets as triptarget>
                                <li>@${triptarget.target.name} in ${triptarget.length} minutes</li>
                            </#list>
                        </ul>            
                    </#list>
                </div>
            </div>
        </div>
    </body>
</html>