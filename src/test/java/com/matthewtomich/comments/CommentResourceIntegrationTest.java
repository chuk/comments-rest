package com.matthewtomich.comments;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CommentResourceIntegrationTest {

	@Test
	public void test() throws Exception {
		final URL url = new URL("http://localhost:9095/comments/echo/boom");
		final BufferedReader reader = new BufferedReader(new InputStreamReader(
				url.openStream()));
		try {
			Assert.assertEquals("boom", reader.readLine());
			Assert.assertNull(reader.readLine());
		} finally {
			reader.close();
		}
	}

}
