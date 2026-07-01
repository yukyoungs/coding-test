# 정수 내림차순으로 배치하기

## 문제 설명

함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

## 제한 조건

- n은 1이상 8000000000 이하인 자연수입니다.

## 입출력 예

| n | return |
|---|--------|
| 118372 | 873211 |

## 풀이 방법론

1. `String.valueOf(n).toCharArray()`로 각 자릿수를 char 배열로 변환했다.
2. `Arrays.sort()`로 오름차순 정렬한 뒤, left/right 포인터로 배열을 직접 뒤집어 내림차순으로 만들었다.
   - `Arrays.sort()`에 `Collections.reverseOrder()`를 쓰면 char[] 배열엔 적용이 안 되기 때문에 직접 뒤집는 방식을 선택했다.
3. `new String(arr)`로 char 배열을 다시 String으로 합친 뒤 `Long.parseLong()`으로 변환해 리턴했다.
   - n이 최대 80억이라 int 범위를 초과하므로 `Long.parseLong()`을 사용했다.
