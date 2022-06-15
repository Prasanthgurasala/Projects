$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestTicket.feature");
formatter.feature({
  "line": 2,
  "name": "Citizen of the UK",
  "description": "",
  "id": "citizen-of-the-uk",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "NHS costs checker",
  "description": "",
  "id": "citizen-of-the-uk;nhs-costs-checker",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am a citizen of the UK",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I put my circumstances into the Checker tool",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.user_is_on_homepage()"
});
formatter.result({
  "duration": 35699549101,
  "status": "passed"
});
formatter.match({
  "location": "Tests.i_am_a_citizen_of_the_UK()"
});
formatter.result({
  "duration": 51329274700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#radio\\-england\"}\n  (Session info: chrome\u003d102.0.5005.115)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DESKTOP-1EGD5T8\u0027, ip: \u0027192.168.0.30\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d102.0.5005.61 (0e59bcc00cc4985ce39ad31c150065f159d95ad3-refs/branch-heads/5005@{#819}), userDataDir\u003dC:\\Users\\prasa\\AppData\\Local\\Temp\\scoped_dir8144_604079429}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dWINDOWS, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:53856}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, browserVersion\u003d102.0.5005.115, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dWINDOWS, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 12f87ef826269c084a732b327ead6366\n*** Element info: {Using\u003did, value\u003dradio-england}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:402)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat Pages.Ticket.clickradioengland(Ticket.java:35)\r\n\tat StepsDef.Tests.i_am_a_citizen_of_the_UK(Tests.java:58)\r\n\tat ✽.When I am a citizen of the UK(TestTicket.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Tests.i_put_my_circumstances_into_the_Checker_tool()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Tests.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "skipped"
});
});