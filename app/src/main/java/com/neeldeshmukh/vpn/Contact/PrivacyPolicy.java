package com.neeldeshmukh.vpn.Contact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.neeldeshmukh.vpn.R;

public class PrivacyPolicy extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
       tv =  findViewById(R.id.textView);
       tv.setText(
        Html.fromHtml("<h1>Privacy Policy for ThunderVPN</h1>\n" +
                "\n" +
                "<p>At neeldeshmukh.com, accessible from https://www.neeldeshmukh.com, one of our main priorities is the privacy of our visitors. This Privacy Policy document contains types of information that is collected and recorded by neeldeshmukh.com and how we use it.</p>\n" +
                "\n" +
                "<p>If you have additional questions or require more information about our Privacy Policy, do not hesitate to contact us.</p>\n" +
                "\n" +
                "<p>This Privacy Policy applies only to our online activities and is valid for visitors to our website with regards to the information that they shared and/or collect in neeldeshmukh.com. This policy is not applicable to any information collected offline or via channels other than this website. Our Privacy Policy was created with the help of the <a href=\"https://www.privacypolicygenerator.info\">Privacy Policy Generator</a> and the <a href=\"https://www.generateprivacypolicy.com/\">Free Privacy Policy Generator</a>.</p>\n" +
                "\n" +
                "<h2>Consent</h2>\n" +
                "\n" +
                "<p>By using our website, you hereby consent to our Privacy Policy and agree to its terms. For our Terms and Conditions, please visit the <a href=\"https://www.privacypolicyonline.com/terms-conditions-generator/\">Terms & Conditions Generator</a>.</p>\n" +
                "\n" +
                "<h2>Information we collect</h2>\n" +
                "\n" +
                "<p>The personal information that you are asked to provide, and the reasons why you are asked to provide it, will be made clear to you at the point we ask you to provide your personal information.</p>\n" +
                "<p>If you contact us directly, we may receive additional information about you such as your name, email address, phone number, the contents of the message and/or attachments you may send us, and any other information you may choose to provide.</p>\n" +
                "<p>When you register for an Account, we may ask for your contact information, including items such as name, company name, address, email address, and telephone number.</p>\n" +
                "\n" +
                "<h2>How we use your information</h2>\n" +
                "\n" +
                "<p>We use the information we collect in various ways, including to:</p>\n" +
                "\n" +
                "<ul>\n" +
                "<li>Provide, operate, and maintain our webste</li>\n" +
                "<li>Improve, personalize, and expand our webste</li>\n" +
                "<li>Understand and analyze how you use our webste</li>\n" +
                "<li>Develop new products, services, features, and functionality</li>\n" +
                "<li>Communicate with you, either directly or through one of our partners, including for customer service, to provide you with updates and other information relating to the webste, and for marketing and promotional purposes</li>\n" +
                "<li>Send you emails</li>\n" +
                "<li>Find and prevent fraud</li>\n" +
                "</ul>\n" +
                "\n" +
                "<h2>Log Files</h2>\n" +
                "\n" +
                "<p>neeldeshmukh.com follows a standard procedure of using log files. These files log visitors when they visit websites. All hosting companies do this and a part of hosting services' analytics. The information collected by log files include internet protocol (IP) addresses, browser type, Internet Service Provider (ISP), date and time stamp, referring/exit pages, and possibly the number of clicks. These are not linked to any information that is personally identifiable. The purpose of the information is for analyzing trends, administering the site, tracking users' movement on the website, and gathering demographic information.</p>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<h2>Advertising Partners Privacy Policies</h2>\n" +
                "\n" +
                "<P>You may consult this list to find the Privacy Policy for each of the advertising partners of neeldeshmukh.com.</p>\n" +
                "\n" +
                "<p>Third-party ad servers or ad networks uses technologies like cookies, JavaScript, or Web Beacons that are used in their respective advertisements and links that appear on neeldeshmukh.com, which are sent directly to users' browser. They automatically receive your IP address when this occurs. These technologies are used to measure the effectiveness of their advertising campaigns and/or to personalize the advertising content that you see on websites that you visit.</p>\n" +
                "\n" +
                "<p>Note that neeldeshmukh.com has no access to or control over these cookies that are used by third-party advertisers.</p>\n" +
                "\n" +
                "<h2>Third Party Privacy Policies</h2>\n" +
                "\n" +
                "<p>neeldeshmukh.com's Privacy Policy does not apply to other advertisers or websites. Thus, we are advising you to consult the respective Privacy Policies of these third-party ad servers for more detailed information. It may include their practices and instructions about how to opt-out of certain options. </p>\n" +
                "\n" +
                "<p>You can choose to disable cookies through your individual browser options. To know more detailed information about cookie management with specific web browsers, it can be found at the browsers' respective websites.</p>\n" +
                "\n" +
                "<h2>CCPA Privacy Rights (Do Not Sell My Personal Information)</h2>\n" +
                "\n" +
                "<p>Under the CCPA, among other rights, California consumers have the right to:</p>\n" +
                "<p>Request that a business that collects a consumer's personal data disclose the categories and specific pieces of personal data that a business has collected about consumers.</p>\n" +
                "<p>Request that a business delete any personal data about the consumer that a business has collected.</p>\n" +
                "<p>Request that a business that sells a consumer's personal data, not sell the consumer's personal data.</p>\n" +
                "<p>If you make a request, we have one month to respond to you. If you would like to exercise any of these rights, please contact us.</p>\n" +
                "\n" +
                "<h2>GDPR Data Protection Rights</h2>\n" +
                "\n" +
                "<p>We would like to make sure you are fully aware of all of your data protection rights. Every user is entitled to the following:</p>\n" +
                "<p>The right to access – You have the right to request copies of your personal data. We may charge you a small fee for this service.</p>\n" +
                "<p>The right to rectification – You have the right to request that we correct any information you believe is inaccurate. You also have the right to request that we complete the information you believe is incomplete.</p>\n" +
                "<p>The right to erasure – You have the right to request that we erase your personal data, under certain conditions.</p>\n" +
                "<p>The right to restrict processing – You have the right to request that we restrict the processing of your personal data, under certain conditions.</p>\n" +
                "<p>The right to object to processing – You have the right to object to our processing of your personal data, under certain conditions.</p>\n" +
                "<p>The right to data portability – You have the right to request that we transfer the data that we have collected to another organization, or directly to you, under certain conditions.</p>\n" +
                "<p>If you make a request, we have one month to respond to you. If you would like to exercise any of these rights, please contact us.</p>\n" +
                "\n" +
                "<h2>Children's Information</h2>\n" +
                "\n" +
                "<p>Another part of our priority is adding protection for children while using the internet. We encourage parents and guardians to observe, participate in, and/or monitor and guide their online activity.</p>\n" +
                "\n" +
                "<p>neeldeshmukh.com does not knowingly collect any Personal Identifiable Information from children under the age of 13. If you think that your child provided this kind of information on our website, we strongly encourage you to contact us immediately and we will do our best efforts to promptly remove such information from our records.</p>"));
    }
}
