package com.zeligsoft.domain.omg.dds.api.QOS.impl;

import com.zeligsoft.base.zdl.staticapi.util.ZDLFactoryRegistry;

import com.zeligsoft.domain.omg.dds.api.QOS.livelinessQosPolicy;
import com.zeligsoft.domain.omg.dds.api.QOS.impl.qosPolicyZImpl;

import com.zeligsoft.domain.omg.dds.api.QOS.LivelinessQosPolicyKind;
import com.zeligsoft.domain.omg.dds.api.QOS.Duration;

public class livelinessQosPolicyZImpl extends qosPolicyZImpl implements
		livelinessQosPolicy {
	protected LivelinessQosPolicyKind _kind;
	protected Duration _lease_duration;

	public livelinessQosPolicyZImpl(org.eclipse.emf.ecore.EObject element) {
		super(element);
	}

	@Override
	public LivelinessQosPolicyKind getKind() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "DDS::QOS::livelinessQosPolicy", "kind");

		if (_kind == null) {
			if (rawValue instanceof org.eclipse.emf.ecore.EObject) {
				_kind = LivelinessQosPolicyKind
						.create((org.eclipse.emf.ecore.EObject) rawValue);
			}
		}
		return _kind;
	}

	@Override
	public Duration getLease_duration() {
		if (_lease_duration == null) {
			final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
					.getValue(eObject(), "DDS::QOS::livelinessQosPolicy",
							"lease_duration");
			if (rawValue instanceof org.eclipse.emf.ecore.EObject) {
				_lease_duration = ZDLFactoryRegistry.INSTANCE.create(
						(org.eclipse.emf.ecore.EObject) rawValue,
						Duration.class);
			}
		}
		return _lease_duration;
	}

}