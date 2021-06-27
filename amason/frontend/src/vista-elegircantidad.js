import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';

class VistaElegircantidad extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <vaadin-select value="Item one" id="select-cantidad" style="flex-shrink: 1; flex-grow: 0; align-self: center; width: 60px;"></vaadin-select>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-elegircantidad';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaElegircantidad.is, VistaElegircantidad);
