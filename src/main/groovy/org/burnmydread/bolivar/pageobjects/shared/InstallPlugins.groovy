package org.burnmydread.bolivar.pageobjects.shared

import geb.Page

/**
 * Created by zach on 7/18/17.
 */
class InstallPlugins extends Page {

    static at = {
        waitFor(60,0.25) { page_title.present }
        waitFor(10,0.1) { directions.present }
        waitFor(10,0.1) { sugested_plugins.present }
        waitFor(10,0.1) { manual_install_plugins.present }

    }
    static content = {
        page_title { $('#main-panel > div > div > div > div > div > div.modal-header.closeable > h4') }
        directions { $('#main-panel > div > div > div > div > div > div.modal-body > div') }
        sugested_plugins  { $('#main-panel > div > div > div > div > div > div.modal-body > div > p.button-set > a.btn.btn-primary.btn-lg.btn-huge.install-recommended > sub') }
        manual_install_plugins  { $('#main-panel > div > div > div > div > div > div.modal-body > div > p.button-set > a.btn.btn-default.btn-lg.btn-huge.install-custom') }

    }
}
