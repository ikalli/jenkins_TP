//
// Variable d'environnement
//
node {
stage('0- clean'){
deleteDir()
checkout scm
}
stage ('1- Print Jenskins variables'){
echo "$env.GLOBAL_JENKINS_VARIABLE"
}
stage ('1- Print all env'){
echo 'Affiche toutes les variables environnement disponibles :'
sh 'env'
}
stage ('1- BuildNumber'){
echo 'Affichage du numero de build:' + BUILD_NUMBER
sh ' echo $BUILD_NUMBER'
}
}
