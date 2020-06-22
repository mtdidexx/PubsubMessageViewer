# Pubsub Message Viewer
An application that consumes GCP Pubsub messages and writes them to GCP logs. 

## Deploying to Cloud Run and connecting to a Pubsub Topic
These steps assume that your topic has already been created

### Deploy container
`gcloud run deploy message-viewer --platform managed --region us-central1 --image gcr.io/gdos-mdonahue-sb/pubsub-message-viewer:Jun17-144917 --no-allow-unauthenticated` 
`gcloud run services add-iam-policy-binding --platform managed message-viewer --member=serviceAccount:resultingsync-sa@gdos-mdonahue-sb.iam.gserviceaccount.com --role=roles/run.invoker`

### Create subscription
`gcloud pubsub subscriptions create loggingsubscription --topic=projects/gdos-mdonahue-sb/topics/resultingsync --labels=gdos=pubsub --push-endpoint=https://message-viewer-p62273dhmq-uc.a.run.app/subscription/logMessage --push-auth-service-account resultingsync-sa@gdos-mdonahue-sb.iam.gserviceaccount.com`

## GCP Documentation
- https://cloud.google.com/run/docs/tutorials/pubsub#run_pubsub_server-java 
- https://cloud.google.com/sdk/gcloud/reference/pubsub/subscriptions/create
- https://cloud.google.com/sdk/gcloud/reference/run/deploy
- https://cloud.google.com/sdk/gcloud/reference/run/services/add-iam-policy-binding