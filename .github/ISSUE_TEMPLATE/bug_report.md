---
name: Bug report
about: Create a report to help us improve
title: ''
labels: ''
assignees: ''

---

<!-- 제목 양식은 다음과 같습니다. -->
<!-- [#이슈 번호] 버그 제목 -->
<!-- ex) [#32] 커밋 자동화 코드 실행 시 커밋 파일 인덱스 추출 오류 -->

## 플랫폼 / 환경

<!-- 하드웨어 플랫폼, 운영체제 등 언급 -->
<!-- 예) Window 10, VScode -->

## 설명 및 재현

<!-- 상황에 대한 자세한 설명과 버그를 재현하는 단계를 언급 -->
<!-- 예) .git/hooks/commit-msg 파일을 활용해 자동화할 때, staging area에 있는 파일을 가져올 시 commit msg file을 읽어오지 못하는 버그 발생 -->
<!-- 예) .git/hooks/commit-msg.sample을 복사하여 확장자명을 지우고, staging area에 있는 파일 목록을 불러오는 코드를 작성 시 재현 가능 -->

## 예상 및 실제 결과

<!-- commit_msg_file을 staging area에서 불러오면 .json을 읽어오는 오류가 발생할 것이다. -->
<!-- 실제로 같은 결과를 불러왔다. / 예상과는 다르게 commit file이 잘 불러와졌다-->

## 해결했다면, 해결 방법

<!-- 해결했다면, 추가적으로 정리 -->
<!-- "$1"로 가장 첫 번째 파일을 불러오니, commit message가 잘 불러와 졌음 -->

## 스크린 샷

<!-- 필요 시 오류 발생 상황 등을 스크린샷으로 첨부 -->
