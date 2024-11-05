import { Component, Input } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-base-page',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './base-page.component.html',
  styleUrl: './base-page.component.css'
})
export class BasePageComponent {
  @Input() pageTitle: string | undefined;
  // @Input() items: any[];

  form: FormGroup;

  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      search: ['']
    });
  }

  submit() {
    console.log('Form submitted with value: ', this.form.value);
  }

}
