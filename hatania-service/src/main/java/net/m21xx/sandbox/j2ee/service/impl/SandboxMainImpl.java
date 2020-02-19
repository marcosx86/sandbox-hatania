package net.m21xx.sandbox.j2ee.service.impl;

import javax.ejb.Stateless;

import net.m21xx.sandbox.j2ee.service.SandboxMainService;

@Stateless
public class SandboxMainImpl implements SandboxMainService {
	
	/* (non-Javadoc)
	 * @see net.m21xx.sandbox.j2ee.services.impl.SandboxMainService#calculaSoma(int, int)
	 */
	public int calculaSoma(int a, int b) {
		return a + b;
	}

}
