# spring_bulletin
![image](https://github.com/Lee-Kyuhwun/spring_bulletin/assets/107871734/346bbc8d-9d25-466d-8b74-7c7deefbfc5a)

**요약**

- 스프링부트를 이용해서 간단한 게시판을 만들었습니다.

**역할**

- 프로젝트 전체 인원
    
    이규훈 
    
- 나의 역할과 기여도
    
    혼자서 프로젝트를 진행하였습니다.
    

**기능**

1. 로그인 / 로그아웃
2. 추천
3. 회원가입
4. 마크다운
5. 검색
6. 수정날짜 표시
7. 글쓴이 표시

1. 앵커
2. 답변 등록
3. 내비게이션 바
4. 페이징
5. 답변 개수 표시
6. 스프링 시큐리티를 통한 보안
7. 마크다운

# 기술 스택
<div>
<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1629972500/noticon/htwpjnfc0hlr1teypbjo.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1629972500/noticon/htwpjnfc0hlr1teypbjo.png" width="40px" /> 

</aside>

<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1567008187/noticon/m4oad4rbf65fjszx0did.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1567008187/noticon/m4oad4rbf65fjszx0did.png" width="40px" /> </aside>


<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1576325989/noticon/rcwm9dy0hu6cbjowbfwi.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1576325989/noticon/rcwm9dy0hu6cbjowbfwi.png" width="40px" /> 

</aside>

<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1603422708/noticon/snx80yunsrqtxnijopnh.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1603422708/noticon/snx80yunsrqtxnijopnh.png" width="40px" /> 

</aside>

<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1566914817/noticon/qwbwpobwhimzw1e3ip1h.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1566914817/noticon/qwbwpobwhimzw1e3ip1h.png" width="40px" /> 

</aside>

<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1567128495/noticon/gpkdob34yhkxoo7cyyqv.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1567128495/noticon/gpkdob34yhkxoo7cyyqv.png" width="40px" />

</aside>

<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1685082263/noticon/jo70lolpscz63hznweoe.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1685082263/noticon/jo70lolpscz63hznweoe.png" width="40px" />

</aside>


<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1592435734/noticon/ovcserf615eo3sbcbv8b.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1592435734/noticon/ovcserf615eo3sbcbv8b.png" width="40px" /> 

</aside>



</aside>

<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1671751435/noticon/f2acjrbrdkr51kbizhoa.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1671751435/noticon/f2acjrbrdkr51kbizhoa.png" width="40px" /> 

</aside>

<aside>
<img src="https://w7.pngwing.com/pngs/928/911/png-transparent-junit-software-testing-spring-framework-unit-testing-java-others-miscellaneous-text-trademark-thumbnail.png" alt="https://w7.pngwing.com/pngs/928/911/png-transparent-junit-software-testing-spring-framework-unit-testing-java-others-miscellaneous-text-trademark-thumbnail.png" width="40px" />

</aside>

<aside>
<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1687307488/noticon/o9lxyva5z8zbwyeaxers.png" alt="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1687307488/noticon/o9lxyva5z8zbwyeaxers.png" width="40px" />
</aside>
  
</div>



**시기**

- 프로젝트 진행 기간 2023.07.07

# 📝ERD

---

![image](https://github.com/Lee-Kyuhwun/spring_bulletin/assets/107871734/06c5c125-5ad2-44b0-9f87-b0ed3b7e8871)

위 다이어그램에서, 각 엔티티는 속성들을 포함하고 있습니다. **`PK`**는 기본 키(Primary Key)를 나타내며, **`FK`**는 외래 키(Foreign Key)를 나타냅니다.

- **`SiteUser`**는 **`Question`**과 **`Answer`**와 양방향 관계를 가집니다. **`SiteUser`**는 여러 **`Question`**을 작성할 수 있으며, 여러 **`Answer`**를 작성할 수 있습니다. 또한, **`SiteUser`**는 여러 **`Question`**과 **`Answer`**에 투표를 할 수 있습니다.
- **`Question`**은 여러 **`Answer`**를 가질 수 있습니다. 각 **`Question`**은 하나의 **`SiteUser`**에 의해 작성되며, 여러 **`SiteUser`**에 의해 투표 받을 수 있습니다.
- **`Answer`**는 하나의 **`Question`**에 속하며, 하나의 **`SiteUser`**에 의해 작성되고 여러 **`SiteUser`**에 의해 투표 받을 수 있습니다.
- **`AnswerVoter`** 테이블은 **`Answer`**와 **`SiteUser`** 간의 투표 관계를 나타냅니다. **`ANSWER_ID`**는 **`Answer`** 테이블의 **`id`**에 대한 외래키이며, **`VOTER_ID`**는 투표한 **`SiteUser`**의 **`id`**에 대한 외래키입니다.
- **`QuestionVoter`** 테이블은 **`Question`**과 **`SiteUser`** 간의 투표 관계를 나타냅니다. **`QUESTION_ID`**는 **`Question`** 테이블의 **`id`**에 대한 외래키이며, **`VOTER_ID`**는 투표한 **`SiteUser`**의 **`id`**에 대한 외래키입니다.
