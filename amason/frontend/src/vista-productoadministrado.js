import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productoadministrado`
 *
 * VistaProductoadministrado element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoadministrado extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-productoadministrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoadministrado.is, VistaProductoadministrado);
