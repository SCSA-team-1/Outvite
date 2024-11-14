<!-- @format -->

## ✔️ Git strategy - (Github Flow)

## 0. 반드시 지켜야 할 전체 흐름

할 일이 생겼으면 이슈를 생성하고, 브랜치를 만들어 이슈를 해결하고, pr을 생성함으로써 develop으로 merge하여 이슈를 닫는다.

## 1. 이슈 생성

ex) 프론트엔드 개발자가 참석자 명단을 조회하는 기능을 만들기 위해서

“FE : 참석자 명단 조회하는 기능 구현” 이라는 issue를 생성한다.

1.  이슈 생성 우측에 있는 assigness에 이슈를 해결할 사람을 태그한다.

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/c4ca1f3b-c565-424c-91f0-c15d9d092ac0/72e0c148-8560-4722-9470-5861e920df05/image.png)

## 2. 브랜치 생성

이슈 제목에 적은 브랜치 이름대로 브랜치를 만들어 개발한다.

git checkout -b FE/feat/get-attendee-list 등

- checkout은 브랜치 만들고 이동이고 switch는 그냥 브랜치 이동

## 3. pr 생성

1. 머지 리퀘스트 제목 :

   FE/feat/get-attendee-list : 참석자 명단 주회하는 기능 구현 완료

   {브랜치 이름} : {이슈를 해결했다는 요약된 내용}

2. [x] ←이렇게 x를 띄어쓰기 없이 넣으면 체크표시됨
3. pr은 브랜치를 없애면서 이슈를 해결하는 과정이므로 머지 리퀘스트 안에 close #9 등 이슈 확실히 삭제할 것
4. 우측에 PR 리뷰 대상자(Reviewers)와, 작업 책임자(Assignees) 지정하기

### 0. 코드 리뷰할 때 주의사항

- **nit 줄이기** : 사소하고 작은 문제로 주로 스타일 가이드 준수, 가독성 개선 등을 의미 / 전체적으로는 중요하지 않지만 품질 향상에 도움이 될 수 있는 부분에서 사용
- **변경 사이즈 줄이기** : 리뷰할 내용이 커지면 코드 리뷰하기 부담

### 1. 코드 리뷰 방식

|  타입  | 개요                                                                  | 설명                                                                                                     |
| :----: | --------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| **P1** | 이번에 반드시 반영되어야 하는 중대한 코드 수정 의견 (Request Changes) | 버그 가능성이 있거나 잘못된 구현인 경우. 만약 반영되지 않는다면 이에 대한 반대 의견도 낼 수 있어야 한다. |
| **P2** | 적극적으로 이야기했으면 하는 의견 (Request Changes)                   | 잠재적인 이슈나 확장성을 고려해야 하는 경우. 토론하며 의견 조율할 수 있다.                               |
| **P3** | 가능하다면 반영해주었으면 하는 의견 (Comment)                         | 지금 구현보다 더 나은 방향이 있는 경우. 이번 반영이 어렵다면 다음 작업에서도 고려해볼 수 있도록 한다.    |
| **P4** | 다음에 반영 되도 되는 의견 (Approve)                                  | 반영이 되지 않거나 반대 의견을 적극적으로 할 필요 없다.                                                  |
| **P5** | 사소한 의견 (Approve)                                                 | 무시해도 됨. 혹은 관련 나누고 싶은 점 나눌 수 있다.                                                      |

## 4. Commit Convention

### 1. Commit Message Structure

|   개요    |             설명             |
| :-------: | :--------------------------: |
| 작성 방법 | **`깃모지_내용_(이슈번호)`** |
|   예제    | :art:\_코드 수정\_([#234]()) |
|   코드    | **`:art:_코드 수정_(#234)`** |

### 2. Commit Type : 깃모지

- 필요 기능 발견 시 담당자에게 건의
- [참고](https://gitmoji.dev/) : IntelliJ, VSCode에서도 연동 가능

| 아이콘 |             코드             |           설명            |                  원문                   |
| :----: | :--------------------------: | :-----------------------: | :-------------------------------------: |
|   🎨   |           `:art:`            |   코드의 구조/형태 개선   | Improve structure / format of the code. |
|  ⚡️   |           `:zap:`            |         성능 개선         |          Improve performance.           |
|   🔥   |           `:fire:`           |      코드/파일 삭제       |          Remove code or files.          |
|   🐛   |           `:bug:`            |       **버그 수정**       |               Fix a bug.                |
|   🚑   |        `:ambulance:`         |         긴급 수정         |            Critical hotfix.             |
|   ✨   |         `:sparkles:`         |        **새 기능**        |         Introduce new features.         |
|   📝   |           `:memo:`           |      문서 추가/수정       |      Add or update documentation.       |
|   💄   |         `:lipstick:`         | UI/스타일 파일 추가/수정  |  Add or update the UI and style files.  |
|   🎉   |           `:tada:`           |       프로젝트 시작       |            Begin a project.             |
|   ✅   |     `:white_check_mark:`     |   **테스트 추가/수정**    |          Add or update tests.           |
|   🔒   |           `:lock:`           |      보안 이슈 수정       |          Fix security issues.           |
|   🔖   |         `:bookmark:`         |   **릴리즈/버전 태그**    |         Release / Version tags.         |
|   💚   |       `:green_heart:`        |       CI 빌드 수정        |              Fix CI Build.              |
|   📌   |         `:pushpin:`          |   특정 버전 의존성 고정   | Pin dependencies to specific versions.  |
|   👷   |   `:construction_worker:`    | CI 빌드 시스템 추가/수정  |     Add or update CI build system.      |
|   📈   | `:chart_with_upwards_trend:` | 분석, 추적 코드 추가/수정 | Add or update analytics or track code.  |

### 3. Commit Type : 내용

- 선택사항
- **`어떻게`** 보다는 **`'무엇을'`, `'왜'`** 변경했는 지에 대해 작성
- 72자를 넘기지 말기

### 4. Commit Type : 이슈번호

- 선택사항
- **`Issue Tracker ID`** 를 작성
- 여러 개의 이슈번호는 **`,`** 로 구분
