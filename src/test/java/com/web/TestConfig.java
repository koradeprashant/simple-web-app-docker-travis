package com.web;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Profile;

@Profile("test")
@AutoConfigureTestDatabase
public class TestConfig {}
