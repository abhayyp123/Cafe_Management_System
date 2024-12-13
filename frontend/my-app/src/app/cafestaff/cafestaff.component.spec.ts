import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CafestaffComponent } from './cafestaff.component';

describe('CafestaffComponent', () => {
  let component: CafestaffComponent;
  let fixture: ComponentFixture<CafestaffComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CafestaffComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CafestaffComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
