JUnit4 실습을 다음의 순서로 하오니 참고하여 진행 바랍니다.

1. JunitCycleTest
@BeforeClass - oneTimeSetUp

@Before - setUp
@Test - testOneItemCollection
@After - tearDown

@Before - setUp
@Test - testEmptyCollection
@After - tearDown

@AfterClass - oneTimeTearDown 

* test method 순서는 보장되지 않는다.
* @Ignore 는 무시된다.

2. JUnit 리뷰
1) A basic JUnit test case
- CalculationTest
2) JUnit assertions
- AssertTest
3) Test Runner
- SuiteClassesTest
4) Advanced JUnit options
- Parameterized test
  : ParameterizedTest
  : ParameterizedSimpleEscapeTest
- Rules
  : RuleOfTimeoutTest
  : RuleOfExceptionTest
  : RuleOfTemporaryFolderTest
- Theories
  : TheoriesTest
- Test execution order
  : ExecuteOrderTest
- Assumptions with Assume
  : AssumeTest
- Categories

3. 워밍업 연습문제 단위 테스트 만들기
1) Alphabet / AlphabetTest
- 요구 기능별 testable 충족 목표.  
2) RefactoredAlphabet / RefactoredAlphabetTest
- 리팩토링 목표.
3) 3 6 9 게임.
- ThreeSixNineGameTest
