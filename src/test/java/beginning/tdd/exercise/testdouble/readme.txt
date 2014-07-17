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
