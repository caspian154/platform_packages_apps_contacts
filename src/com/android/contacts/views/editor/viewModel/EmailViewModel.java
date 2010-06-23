/*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.contacts.views.editor.viewModel;

import com.android.contacts.views.editor.DisplayRawContact;

import android.content.ContentValues;
import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Email;

public class EmailViewModel extends FieldAndTypeViewModel {
    private EmailViewModel(Context context, DisplayRawContact rawContact, long dataId,
            ContentValues contentValues, int titleResId) {
        super(context, rawContact, dataId, contentValues, Email.CONTENT_ITEM_TYPE, titleResId,
                Email.ADDRESS, Email.TYPE, Email.LABEL);
    }

    public static EmailViewModel createForExisting(Context context, DisplayRawContact rawContact,
            long dataId, ContentValues contentValues, int titleResId) {
        return new EmailViewModel(context, rawContact, dataId, contentValues, titleResId);
    }

    @Override
    protected CharSequence getTypeDisplayLabel() {
        return Email.getTypeLabel(getContext().getResources(), getType(), getLabel());
    }
}
