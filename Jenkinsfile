node('master') {
 stage 'Pull repository'
 echo 'Fazendo pull das informações novas'
 stage 'Build'
 echo "Rodando build da aplicação java com Maven"
 echo "mvn -B -DskipTests clean package"
 stage 'Tests'
 echo 'Rodando testes na aplicação'
 echo 'mvn test'
 stage 'Deploy'
 echo 'Realizando deploy da aplicação gerada e testada com shell script'
 echo './jenkins/scripts/deploy.sh'
 stage 'Notification'
 echo 'Enviando uma mensagem de notificação do deploy via webhook para o Slack'
 echo 'curl -X POST -H  Conteúdo e forma da mensagem  SUA_WEBHOOK_URL'
}
