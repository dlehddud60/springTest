package com.example.demo;

import org.junit.jupiter.api.BeforeEach;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.order.OrderService;

class MemberServiceTest {
 MemberService memberService;
 @BeforeEach
 public void beforeEach() {
 AppConfig appConfig = new AppConfig();
 memberService = appConfig.memberService();
 }
}
class OrderServiceTest {
 MemberService memberService;
 OrderService orderService;
 @BeforeEach
 
 public void beforeEach() {
 AppConfig appConfig = new AppConfig();
 memberService = appConfig.memberService();
 orderService = appConfig.orderService();
 }
}