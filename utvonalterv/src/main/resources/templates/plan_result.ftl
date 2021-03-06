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
                    <a class="navbar-brand">Your plan result</a>
                </div>
            </div>
        </nav>

        <div class="container" style="padding: 40px 15px;">
            <div class="panel panel-default" style="font-family: Verdana,sans-serif; font-size: 15px; line-height: 1.5;">
                <div class="panel-heading">Thank you for choosing us</div>
                <div class="panel-body">
                    <div>
                        Your request was:<br/>
                        ${from}<br/>
                        ${to}<br/>
                        ${day}<br/>
                        ${hour}:${minute}<br/>
                        ${debugMode}
                    </div>
                </div>
            </div>
            <div class="panel panel-default" style="font-family: Verdana,sans-serif; font-size: 15px; line-height: 1.5;">
                <div class="panel-heading">Our recommended route:</div>
                <div class="panel-body">
                    <div>
                        ${result}
                    </div>
                </div>
            </div>


            <form action="/plan_result" method="POST">
                <input type="hidden" value="${from}" name="from" />
                <input type="hidden" value="${to}" name="to" />
                <input type="hidden" value="${day}" name="day" />
                <input type="hidden" value="${hour}" name="hour" />
                <input type="hidden" value="${minute}" name="minute" />
                <input type="hidden" value="true" name="debugMode" />

                <div class="form-group">
                    <button id="submit" type="submit" class="btn btn-default">Resend with debugMode on</button>
                </div>
            </form>

            <form action="/plan_result" method="POST">
                <input type="hidden" value="${from}" name="from" />
                <input type="hidden" value="${to}" name="to" />
                <input type="hidden" value="${day}" name="day" />
                <input type="hidden" value="${hour}" name="hour" />
                <input type="hidden" value="${minute}" name="minute" />
                <input type="hidden" value="false" name="debugMode" />

                <div class="form-group">
                    <button id="submit" type="submit" class="btn btn-default">Resend with debugMode off</button>
                </div>
            </form>

        </div>
    </body>
</html>