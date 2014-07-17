Test Double 실습을 다음의 순서로 하오니 참고하여 진행 바랍니다.

1.Test Double 사용 예.
1) fake test 예.
- CarTest
  : Car, Engine, FakeEngineImpl
- FakeUserRepositoryImpl
  : UserRepository, User
  
2) Dummy
- EngineImpl

3) Spy
- DLogTest
  : DLog, DlogTarget, SpyDLogTargetImpl

2. Mockito
1) mockito 예
- BasicMockitoTest

3. Mockito 리뷰 & 연습
1) BasicMockitoTest
2) AnnotativeMockitoTest
3) BehaviorStyleTest
4) SingleVerificationTest
5) MultipleVerificationOrderTest

4. Test Double 연습문제
1) 뉴스 시각 노출
- ArticleServiceTimeTest
  : fake
  : mockito
