/*
 * Copyright (c) 2011, salesforce.com, inc.
 * All rights reserved.
 * Redistribution and use of this software in source and binary forms, with or
 * without modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * - Neither the name of salesforce.com, inc. nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission of salesforce.com, inc.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.salesforce.samples.restexplorer;


import android.widget.EditText;
import android.widget.TextView;

import com.salesforce.androidsdk.security.AbstractPasscodeActivity;

/**
 * Activity responsible for passcode creation/validation
 */
public class PasscodeActivity extends AbstractPasscodeActivity {

	@Override
	protected int getLayoutId() {
		return R.layout.passcode;
	}

	@Override
	protected TextView getTitleView() {
		return (TextView) findViewById(R.id.passcode_title);
	}

	@Override
	protected TextView getErrorView() {
		return (TextView) findViewById(R.id.passcode_error);
	}

	@Override
	protected TextView getInstructionsView() {
		return (TextView) findViewById(R.id.passcode_instructions);
	}

	@Override
	protected EditText getEntryView() {
		return (EditText) findViewById(R.id.passcode_text);
	}
	
	@Override
	protected String getCreateTitle() {
		return getString(R.string.passcode_create_title);
	}
	
	@Override
	protected String getEnterTitle() {
		return getString(R.string.passcode_enter_title);
	}
	
	@Override
	protected String getConfirmTitle() {
		return getString(R.string.passcode_confirm_title);
	}
	
	@Override
	protected String getEnterInstructions() {
		return getString(R.string.passcode_enter_instructions);
	}
	
	@Override
	protected String getCreateInstructions() {
		return getString(R.string.passcode_create_instructions);
	}
	
	@Override
	protected String getConfirmInstructions() {
		return getString(R.string.passcode_confirm_instructions);
	}
	
	@Override
	protected String getMinLengthInstructions(int minPasscodeLength) {
		return getString(R.string.passcode_min_length, minPasscodeLength);
	}
	
	@Override
	protected String getPasscodeTryAgainError(int countAttemptsLeft) {
		return getString(R.string.passcode_try_again, countAttemptsLeft);
	}

	@Override
	protected String getPasscodeFinalAttemptError() {
		return getString(R.string.passcode_final);
	}

	@Override
	protected String getPasscodesDontMatchError() {
		return getString(R.string.passcodes_dont_match);
	}
	
}