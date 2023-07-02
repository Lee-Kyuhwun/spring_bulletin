package com.example.bulletin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BulletinApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		List<Question> all = this.questionRepository.findAll();
		assertEquals(8,all.size());


		Question q = all.get(0);
		assertEquals("sbb가 무엇인가요?",q.getSubject());
	}
}
