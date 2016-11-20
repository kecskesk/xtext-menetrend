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
                    <a class="navbar-brand">Trip planner</a>
                </div>
            </div>
        </nav>

        <div class="container" style="padding: 40px 15px;">
            <div class="panel panel-default" style="font-family: Verdana,sans-serif; font-size: 15px; line-height: 1.5;">
                <div class="panel-body"><form action="/plan_result" method="POST">
                    <h4>I want to travel </h4>

                    <div class="form-group">
                        <label for="sel1">From:</label>
                        <select class="form-control" id="sel1" name="from">
                            <#list stops?values as stop>
                                <option value="${stop.name}">${stop.name}</option>
                            </#list>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="sel2">To:</label>
                        <select class="form-control" id="sel2" name="to">
                            <#list stops?values as stop>
                                <option value="${stop.name}">${stop.name}</option>
                            </#list>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="sel3">On:</label>
                        <select class="form-control" id="sel3" name="day">
                            <#list days as day>
                                <option value="${day.getName()}">${day.getName()}</option>
                            </#list>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="sel3">At:</label>
                        <div class="row">
                            <div class="col-xs-1">
                                <input required type="number" class="form-control" id="text1" oninput="maxLengthCheck(this)" maxlength="2" min="0" max="23" name="hour">
                            </div>
                            <div class="col-xs-1" style="text-align:center">
                                :
                            </div>
                            <div class="col-xs-1">
                                <input required type="number" class="form-control" id="text2" oninput="maxLengthCheck(this)" maxlength="2" min="0" max="59" name="minute">
                            </div>
                            <script>
                              function maxLengthCheck(object)
                              {
                                if (object.value.length > object.max.length)
                                  object.value = object.value.slice(0, object.max.length)
                              }
                            </script>
                    </div>
                    
                    <div style="margin:0; padding:0; height:25px;"></div>

                    <div class="form-group">
                        <button id="submit" type="submit" class="btn btn-default">Submit</button>
                    </div>
                </form></div>
            </div>
        </div>
    </body>

</html>