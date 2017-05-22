# bolivar
## Overview
This is a simplified, geb version of jenkinsci/acceptance-test-harness which is based on the geb-spock UI test stack and is designed to be as flexible as possible.

## Dependencies:
You need to have the geckodriver package installed or the browser creation will fail.

# Running the tests:
mvn test  -Dbolivar.password='password' -Dbolivar.username='username' -Dbolivar.url='cjoc url'

