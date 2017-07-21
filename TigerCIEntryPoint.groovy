def version = '1.0'

void run_bolivar(String jenkinsUrl, String username, String password) {
    stage('install license') {
        sh "mvn test -Dbolivar.username=$username -Dbolivar.password=$password -Dbolivar.url=$jenkinsUrl -Dtest=InstallLicenseKey"
    }
    stage('install plugins') {
        sh "mvn test -Dbolivar.username=$username -Dbolivar.password=$password -Dbolivar.url=$jenkinsUrl -Dtest=InstallLicenseKey"
    }
    stage('create master') {
        sh "mvn test -Dbolivar.username=$username -Dbolivar.password=$password -Dbolivar.url=$jenkinsUrl -Dtest=CreateNewTeamTest"
    }
}
