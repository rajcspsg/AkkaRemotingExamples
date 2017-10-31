
# AkkaRemotingExamples
=======
activator-akka-scala-seed
=========================

A minimal seed template for an Akka with Scala build 


1. sbt runMain module09.remoteB.RemoteBStartup

        `
            [info] Running module09.remoteB.RemoteBStartup 
            [INFO] [10/31/2017 14:46:41.500] [run-main-0] [akka.remote.Remoting] Starting remoting
            [INFO] [10/31/2017 14:46:42.003] [run-main-0] [akka.remote.Remoting] Remoting started; listening on addresses :[akka.tcp://RemoteB@localhost:5052]
            [INFO] [10/31/2017 14:46:42.006] [run-main-0] [akka.remote.Remoting] Remoting now listens on addresses: [akka.tcp://RemoteB@localhost:5052]
        `

2. sbt runMain module09.remoteA.RemoteAStartup

        `
            [info] Running module09.remoteA.RemoteAStartup 
            [INFO] [10/31/2017 14:47:49.213] [run-main-0] [akka.remote.Remoting] Starting remoting
            [INFO] [10/31/2017 14:47:49.729] [run-main-0] [akka.remote.Remoting] Remoting started; listening on addresses :[akka.tcp://RemoteA@localhost:5051]
            [INFO] [10/31/2017 14:47:49.731] [run-main-0] [akka.remote.Remoting] Remoting now listens on addresses: [akka.tcp://RemoteA@localhost:5051]
            a2 akka://RemoteA/user/a2OnRemoteA 
            b2 akka.tcp://RemoteB@localhost:5052/remote/akka.tcp/RemoteA@localhost:5051/user/b1OnRemoteB 
            a1 akka://RemoteA/user/a1OnRemoteA
            RECEIVED REPLY TO RemoteA1: RemoteB1 received your message: Ping from RemoteA1 after create of b1OnRemoteB
            RECEIVED MESSAGE TO RemoteA2: Ping from RemoteB1 after selection of a1OnRemoteA
        `

3. RemoteB actor trace would be updated as below.

        `
            [info] Running module09.remoteB.RemoteBStartup 
            [INFO] [10/31/2017 14:46:41.500] [run-main-0] [akka.remote.Remoting] Starting remoting
            [INFO] [10/31/2017 14:46:42.003] [run-main-0] [akka.remote.Remoting] Remoting started; listening on addresses :[akka.tcp://RemoteB@localhost:5052]
            [INFO] [10/31/2017 14:46:42.006] [run-main-0] [akka.remote.Remoting] Remoting now listens on addresses: [akka.tcp://RemoteB@localhost:5052]
            MESSAGE TO akka://RemoteB/remote/akka.tcp/RemoteA@localhost:5051/user/b1OnRemoteB: Ping from RemoteA1 after create of b1OnRemoteB
            SELECTION OF a2: ActorSelection[Anchor(akka.tcp://RemoteA@localhost:5051/), Path(/user/a2OnRemoteA)]
        `


