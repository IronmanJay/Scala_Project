package AkkaBase.Actors

import akka.actor.{ActorRef, ActorSystem, Props}

object ActorGame extends App {

  //创建ActorSystem
  val actorfactory: ActorSystem = ActorSystem("actorfactory")
  //先创建BActor引用/代理
  val bActorRef: ActorRef = actorfactory.actorOf(Props[BActor], "bActor")
  //创建AActor的引用
  val aActorRef: ActorRef = actorfactory.actorOf(Props(new AActor(bActorRef)), "aActor")
  //aActor出招
  aActorRef ! "start"

}
