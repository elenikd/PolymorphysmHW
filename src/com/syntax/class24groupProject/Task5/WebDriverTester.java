package com.syntax.class24groupProject.Task5;

    public class WebDriverTester {
        public static void main(String[] args) {

            RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(),
                    new FireFoxDriver(), new SafariDriver()};
            for (RemoteWebDriver remote : remoteWebDrivers
            ) {

                remote.open();
                System.out.println(remote.getTitle());

                remote.close();
                remote.getScreenshot();
                remote.navigate();
            }
        }
    }

