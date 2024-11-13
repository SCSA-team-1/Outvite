## ✔️ Git strategy - (Github Flow)

**1. 브랜치 생성**

- 브랜치 생성시 다음과 같은 방식으로 브랜치 목적에 맞는 브랜치 헤더를 설정한다.

| 생성 목적 | 브랜치 위치                  |
| --------- | ---------------------------- |
| 기능 개발 | [origin/feat/{issue_number-content}] |
| 버그 픽스 | [origin/fix/{issue_number-content}]  |

```
issue_number: 해당 이슈가 진행되는 스프린트에서 할당받은 고유 이슈 번호
```

- 체계적인 분류를 위해 브랜치 이름을 통해 의도를 명확하게 드러낸다.

- 새로운 브랜치는 항상 최신의 develop 브랜치에서 만든다.

- develop 브랜치는 항상 최신의 상태로 유지한다.

**2. 개발 & 커밋 & 푸쉬**

- 커밋 메세지를 명확하게 작성한다.

- 원격 브랜치로 수시로 push하여 상황을 공유한다.

- ./dev/README.md 를 참고

**3. MR(Merge Request) 생성**

- 피드백이나 도움이 필요할 때 그리고 merge 준비가 완료되었을 때 Merge Request를 생성한다.

- 동료들의 리뷰가 끝난 후 준비가 완료되었다면 develop 브랜치로 반영을 요구한다

- develop 브랜치로 merge될 경우 conflict를 작업 중인 브랜치에서 미리 해결하고 진행한다.

- MR 생성 시 예시

  - MR 제목

  | 생성 목적 | MR 제목                                 |
  | --------- | --------------------------------------- |
  | 기능 개발 | [Feat] : {issue_name}({issue_number})   |
  | 버그 픽스 | [Fix] : {issue_name}({issue_number})      |
  | 코드 개선 | [Refactor] : {issue_name}({issue_number}) |
  | css 개선 | [Style] : {issue_name}({issue_number}) |
  | 문서 수정 | [Docs] : {issue_name}({issue_number}) |
  | 빌드 설정 변경 등 기타 작업 | [Chore] : {issue_name}({issue_number}) |
  

  - MR 설명

  ```
  - Feature:
   - 개발내용
  - Notes:
    - PR리뷰시 주의할점, 추가 전달사항
  ```



## ✔️ Commit Convention

### 1. Commit Message Structure

|   개요    |             설명             |
| :-------: | :--------------------------: |
| 작성 방법 | **`깃모지_내용_(이슈번호)`** |
|   예제    |  :art:\_코드 수정\_([#234]())  |
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

## ✔️ Merge Convention

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


