import com.sendgrid.SendGrid
import com.typesafe.config.ConfigFactory

object MailSender extends App {
  val config = ConfigFactory.load()
  val apiKey = config.getString("API_KEY")
  val toArr = config.getStringList("TO_ARR").toArray(Array[String]())
  val from = config.getString("FROM")

  val email = new SendGrid.Email()
    .addSmtpApiTo(toArr)
    .setFrom(from)
    .setFromName("わたしだよ")
    .setSubject("【みてね】だいじなメールだよ")
    .setHtml("""<!DOCTYPE html
        PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        .ExternalClass,
        .ExternalClass div,
        .ExternalClass font,
        .ExternalClass p,
        .ExternalClass span,
        .ExternalClass td,
        img {
            line-height: 100%
        }

        #outlook a {
            padding: 0"
        }

        .ExternalClass,
        .ReadMsgBody {
            width: 100%
        }

        a,
        blockquote,
        body,
        li,
        p,
        table,
        td {
            -webkit-text-size-adjust: 100%;
            -ms-text-size-adjust: 100%
        }

        a {
            color: #2A7BB8;
        }

        table,
        td {
            mso-table-lspace: 0;
            mso-table-rspace: 0
        }

        img {
            -ms-interpolation-mode: bicubic;
            border: 0;
            height: auto;
            outline: 0;
            text-decoration: none
        }

        table {
            border-collapse: collapse !important
        }

        #bodyCell,
        #bodyTable,
        body {
            height: 100% !important;
            margin: 0;
            padding: 0;
            font-family: ProximaNova, sans-serif
        }

        #bodyCell {
            padding: 20px
        }

        #bodyTable {
            width: 600px
        }

        @font-face {
            font-family: ProximaNova;
            src: url(https://cdn.auth0.com/fonts/proxima-nova/proximanova-regular-webfont-webfont.eot);
            src: url(https://cdn.auth0.com/fonts/proxima-nova/proximanova-regular-webfont-webfont.eot?#iefix) format('embedded-opentype'), url(https://cdn.auth0.com/fonts/proxima-nova/proximanova-regular-webfont-webfont.woff) format('woff');
            font-weight: 400;
            font-style: normal
        }

        @font-face {
            font-family: ProximaNova;
            src: url(https://cdn.auth0.com/fonts/proxima-nova/proximanova-semibold-webfont-webfont.eot);
            src: url(https://cdn.auth0.com/fonts/proxima-nova/proximanova-semibold-webfont-webfont.eot?#iefix) format('embedded-opentype'), url(https://cdn.auth0.com/fonts/proxima-nova/proximanova-semibold-webfont-webfont.woff) format('woff');
            font-weight: 600;
            font-style: normal
        }

        @media only screen and (max-width: 480px) {
            #bodyTable,
            body {
                width: 100% !important
            }

            a,
            blockquote,
            body,
            li,
            p,
            table,
            td {
                -webkit-text-size-adjust: none !important
            }

            body {
                min-width: 100% !important
            }

            #bodyTable {
                max-width: 600px !important
            }

            #signIn {
                max-width: 280px !important
            }
        }
    </style>
</head>
<body leftmargin="0" marginwidth="0" topmargin="0" marginheight="0" offset="0"
      style="-webkit-text-size-adjust: 100%;-ms-text-size-adjust: 100%;margin: 0;padding: 0;font-family: &quot;ProximaNova&quot;, sans-serif;height: 100% !important;">
<center>
    <table
            style="width: 600px;-webkit-text-size-adjust: 100%;-ms-text-size-adjust: 100%;mso-table-lspace: 0pt;mso-table-rspace: 0pt;margin: 0;padding: 0;font-family: &quot;ProximaNova&quot;, sans-serif;border-collapse: collapse !important;height: 100% !important;"
            align="center" border="0" cellpadding="0" cellspacing="0" height="100%" width="100%" id="bodyTable">
        <tr>
            <td align="center" valign="top" id="bodyCell"
                style="-webkit-text-size-adjust: 100%;-ms-text-size-adjust: 100%;mso-table-lspace: 0pt;mso-table-rspace: 0pt;margin: 0;padding: 20px;font-family: &quot;ProximaNova&quot;, sans-serif;height: 100% !important;">
                <div class="main">
                    　 <p
                        style="text-align: center;-webkit-text-size-adjust: 100%;-ms-text-size-adjust: 100%; margin-bottom: 30px;">
                    <img src="https://i.ytimg.com/vi/Yw-DrxgjWnE/hqdefault.jpg" width="150" alt="XXXchimu"
                         style="-ms-interpolation-mode: bicubic;border: 0;height: auto;line-height: 100%;outline: none;text-decoration: none;">
                </p>
                    <!-- Email change content -->
                    <p style="font-size: 1.0em; line-height: 1.3; color: #333333;">
                        ヤッホーみんな息してる？
                    </p>
                    <p style="font-size: 1.0em; line-height: 1.3; color: #333333;">
                        大変なことになっちゃったので、下の口座に投げ銭よろしくね！
                    </p>
                    <p style="font-size: 1.0em; line-height: 1.3; color: #333333">
                        <b>YouTube銀行 炎上支店 10194649</b></p>
                    <br>
                    <div
                            style="background-color: #f7f8f9; padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; border-radius: 4px;">
                        <p style="font-size: 1.0em; line-height: 1.8; color:#333333;">
                            【おねがい！】<br>投げ銭するときは下の注意事項を守ってね！<br><b>1000万円以上の投げ銭</b>
                    </div>
                    <br>
                    <br>
                    <strong style="color:#212121;">YouTube: <a href="https://www.youtube.com" target="_blank"
                                                           style="color:#212121;">YouTube</a></strong>
                    <p stlye="font-size: 1.2em; line-height: 1.3"></p>
                    <br><br>
                    <hr style="border: 2px solid #999999; border-bottom: 0; margin: 20px 0;">
                </div>
            </td>
        </tr>
    </table>
</center>
</body>
</html>""")

  val sendgrid = new SendGrid(apiKey)
  val response = sendgrid.send(email)
  println(response.getMessage)
}
