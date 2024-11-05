import { Component, Input } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common'; 

@Component({
  selector: 'app-home-page',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule], 
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent {
  @Input() disablePrimaryBtn: boolean | undefined;
  @Input() title: string | undefined;
  @Input() primaryBtnText: string | undefined;
  @Input() secondaryBtnText: string | undefined;

  homeForm: FormGroup;

  carouselItems = [
    { title: 'CineStream', subtitle: 'Subtitle 1' },
    { title: 'Movie 2', subtitle: 'Subtitle 2' },
    { title: 'Series 3', subtitle: 'Subtitle 3' },
  ];

  constructor(private fb: FormBuilder) {
    this.homeForm = this.fb.group({});
  }

  submit() {
    console.log('Form submitted');
  }

  navigate() {
    console.log('Navigating...');
  }
}
