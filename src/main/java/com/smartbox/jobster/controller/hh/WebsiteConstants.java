package com.smartbox.jobster.controller.hh;

public interface WebsiteConstants {

    String INTEGRATION_LOGIN = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>integration</title>\n" +
            "    <style>\n" +
            "        .inner {\n" +
            "            display: inline-block;\n" +
            "            width: 50%;\n" +
            "            border-radius: 20px;\n" +
            "            transform: translate(50%, 50%);\n" +
            "            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n" +
            "        }\n" +
            "        .inner img {\n" +
            "            width: 20%;\n" +
            "            text-align: center;\n" +
            "            margin-left: 37.5%;\n" +
            "            margin-top: -12.5%;\n" +
            "            padding: 2.5%;\n" +
            "            border-radius: 100%;\n" +
            "        }\n" +
            "        .inner .content {\n" +
            "            padding-bottom: 5%;\n" +
            "        }\n" +
            "        .content h2 {\n" +
            "            font-family: Arial, Helvetica, sans-serif;\n" +
            "            font-size: 42px;\n" +
            "            color: #42ba96;\n" +
            "        }\n" +
            "        .footer {\n" +
            "            background-color: lightskyblue;\n" +
            "            border-radius: 0 0 20px 20px;\n" +
            "            font-family: Arial, Helvetica, sans-serif;\n" +
            "            color: #783105;\n" +
            "        }\n" +
            "        .footer h3 {\n" +
            "            margin: 0;\n" +
            "            padding: 20px;\n" +
            "            text-align: center;\n" +
            "            cursor: pointer;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <div class=\"outer\">\n" +
            "        <div class=\"inner\">\n" +
            "            <div class=\"content\">\n" +
            "                <h2 style=\"text-align: center;\">my-content</h2>\n" +
            "            </div>\n" +
            "            <div class=\"footer\">\n" +
            "                <h3 onclick=\"closeWindow()\">Close</h3>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "    <script>\n" +
            "        function closeWindow() {\n" +
            "            if (window.integrationPopup && !window.integrationPopup.closed) {\n" +
            "                window.integrationPopup.close();\n" +
            "            }\n" +
            "        }\n" +
            "    </script>\n" +
            "</body>\n" +
            "</html>";
}
