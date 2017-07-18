package org.burnmydread.bolivar.pageobjects.cjoc

import geb.Page

/**
 * Created by zach on 7/17/17.
 */
class LicenseLandingPage extends Page {
    static at = {
        waitFor(60,0.25) { page_title.present }
        waitFor(10,0.1) { trial.present }
        waitFor(10,0.1) { enter_license.present }
    }

    static content = {
        page_title { $('#main-panel > div > div > div > div > div > div.modal-body > div > div > div:nth-child(3) > div > h1') }
        trial  { $('#btn-com_cloudbees_opscenter_server_license_OperationsCenterEvaluationRegistrar > strong') }
        enter_license { $('#btn-com_cloudbees_jenkins_plugins_license_ManualRegistrar > strong') }
    }
}
